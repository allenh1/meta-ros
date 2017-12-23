# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example qt programs, generated from code similar to that used by the       roscr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt4-dev message-generation message-runtime qt-build roscpp std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/qt_ros-release/archive/release/kinetic/qt_tutorials/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8892590e3b0ea6f6c1ee241a863df9af"
SRC_URI[sha256sum] = "ede720d4736f071a376076b0bf511d63dea9bc40db1a96ca6a3ec8f05878b875"
S = "${WORKDIR}/qt_ros-release-release-kinetic-qt_tutorials-0.2.9-0"

inherit catkin
