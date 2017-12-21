# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules pkgconfig pluginlib python-qt-binding qt5-qmake qt-gui qtbase5-dev libtinyxml"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_cpp/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89e436ac645bbdb73432ec69f17ea52a"
SRC_URI[sha256sum] = "7df42ace865c6694eb6bb110a5316f268877edba201aa46c3d3372f61527298f"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui_cpp-0.3.8-0"

inherit catkin
