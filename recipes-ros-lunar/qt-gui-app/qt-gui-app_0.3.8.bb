# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin qt-gui"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_app/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29db22225825306ab55ee1e794d48c32"
SRC_URI[sha256sum] = "e6c804915f29d5b0a64430f2f06cd640d58cf6f007737705774d92590e2765ea"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui_app-0.3.8-0"

inherit catkin
