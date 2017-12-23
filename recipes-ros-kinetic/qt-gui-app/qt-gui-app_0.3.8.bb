# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-gui"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_gui_app/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7127393e6e561c3fc3209f30f4a2aa49"
SRC_URI[sha256sum] = "2e1ab70a7982f066e4995ae14f3b4c45dc6703a984a3a4010710b222e2b9ce29"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_gui_app-0.3.8-0"

inherit catkin
