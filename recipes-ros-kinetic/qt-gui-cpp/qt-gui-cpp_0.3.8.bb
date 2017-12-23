# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules pkgconfig pluginlib python-qt-binding qt5-qmake qt-gui qtbase5-dev libtinyxml"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_gui_cpp/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10b2c2f5179a469d374b8b510c55d829"
SRC_URI[sha256sum] = "4483632d337af8dc1a20b03f777acc4a6c1bd3bcd3e9fd40cc068cdf25e4dfde"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_gui_cpp-0.3.8-0"

inherit catkin
