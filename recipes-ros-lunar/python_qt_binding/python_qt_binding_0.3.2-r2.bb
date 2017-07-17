# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides Python bindings for Qt.
    There are two providers: pyside "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=e1c82804571b5dad36b0e6f13fd73e4a"

DEPENDS = "catkin python-qt5-bindings qtbase5-dev rosbuild"
SRC_URI = "https://github.com/ros-gbp/python_qt_binding-release/archive/release/lunar/python_qt_binding/0.3.2-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "806c1303948b052f9afc2d7d20e3e69d"
SRC_URI[sha256sum] = "78800a55021386a39c7bee70a89f5d88b9a45fec276720cf81509839acf3ed41"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
