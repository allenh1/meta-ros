# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GU"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_gui_core/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cffa902c894718960edda9ccf9d062d0"
SRC_URI[sha256sum] = "3f85e37ba3b0ab237bc5addac3b16389486f659a2ebe67ea6ab6acc770f0ca7e"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_gui_core-0.3.8-0"

inherit catkin
