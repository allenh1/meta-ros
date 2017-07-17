# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin pkg-config pluginlib python_qt_binding qt5-qmake qt_gui qtbase5-dev tinyxml"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_cpp/0.3.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e903d464eebc34b651ae6900ec18083"
SRC_URI[sha256sum] = "58b32dedd5c384952bd475a03491100dcf70f4320144e878a4d9a96840ab841b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
