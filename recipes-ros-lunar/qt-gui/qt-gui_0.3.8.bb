# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui provides the infrastructure for an integrated graphical user interface ba"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-qt5-bindings python-rospkg python-qt-binding qt5-qmake tango-icon-theme"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5583770d5057e495a696651090b4951d"
SRC_URI[sha256sum] = "e268f2c10a557201f4fd56731a9caff6b1d19c45df7769b8413c8713964211ff"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui-0.3.8-0"

inherit catkin
