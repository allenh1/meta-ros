# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt5-bindings qtbase5-dev rosbuild"
SRC_URI = "https://github.com/ros-gbp/python_qt_binding-release/archive/release/kinetic/python_qt_binding/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e60508a43b5c6dfe2648442cf32f807a"
SRC_URI[sha256sum] = "f74bb2cc87262b8118720c62c1bbf44b737c614595a08812e4bd3056731b7d55"
S = "${WORKDIR}/python_qt_binding-release-release-kinetic-python_qt_binding-0.3.3-0"

inherit catkin
