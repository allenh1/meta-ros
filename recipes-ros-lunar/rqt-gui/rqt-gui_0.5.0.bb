# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical u"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin qt_gui"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt_gui/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ef7d0a6924bda6f1f6c2792909df36a"
SRC_URI[sha256sum] = "575355afe8503c4c1fbe421ad164c50b736edea60f2391909d81cbf870521cab"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
