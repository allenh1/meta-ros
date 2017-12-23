# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical u"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-gui"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/kinetic/rqt_gui/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b6bd46f206dc4114e11e90bfaf96a51"
SRC_URI[sha256sum] = "ebc17ee30ca55f8db9ec9fc43bfecbe684e78fdff42ba8449069de593f7e1215"
S = "${WORKDIR}/rqt-release-release-kinetic-rqt_gui-0.5.0-0"

inherit catkin
