# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a99398ef7a69b5ba0b3e0212d542cc11"

DEPENDS = "catkin qt_gui"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_app/0.3.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e585de034d57f6b112f5b892eb180aa7"
SRC_URI[sha256sum] = "11bfceb743a910ca79dce0886772193e3c71949b3d0de768920a33fea0a2d72f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
