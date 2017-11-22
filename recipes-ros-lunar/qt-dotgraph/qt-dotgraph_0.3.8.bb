# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-pydot python-qt-binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_dotgraph/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f657e546d3d534e740c72400afa0d6f1"
SRC_URI[sha256sum] = "16960d1edbc307a4e825590528f164a539a4c3222b51541a9bdd1e14ff60aeb7"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_dotgraph-0.3.8-0"

inherit catkin
