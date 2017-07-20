# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GU"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_core/0.3.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0994958cb7785545c2dad781990857d2"
SRC_URI[sha256sum] = "71282a94225f171db1b09b4265fbe05933956f15c53c13d44c6aa8ff098de835"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
