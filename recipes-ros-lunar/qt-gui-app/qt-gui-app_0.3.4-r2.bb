# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-gui"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_app/0.3.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e585de034d57f6b112f5b892eb180aa7"
SRC_URI[sha256sum] = "11bfceb743a910ca79dce0886772193e3c71949b3d0de768920a33fea0a2d72f"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui_app-0.3.4-2"

inherit catkin
