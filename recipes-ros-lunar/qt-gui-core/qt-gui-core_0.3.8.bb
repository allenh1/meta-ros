# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GU"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_core/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6472b3287db6dc0bf30c8e6604292ced"
SRC_URI[sha256sum] = "48e92e44ac30dadf1e3956dc461763d2fcd779132963ca64a76e0efe81462985"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui_core-0.3.8-0"

inherit catkin
