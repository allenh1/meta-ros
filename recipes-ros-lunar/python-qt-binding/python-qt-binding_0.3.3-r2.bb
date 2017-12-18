# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-qt5-bindings qtbase5-dev rosbuild"
SRC_URI = "https://github.com/ros-gbp/python_qt_binding-release/archive/release/lunar/python_qt_binding/0.3.3-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "86aa8814e06e7da030fe3f60a519aaea"
SRC_URI[sha256sum] = "6e3016121c8cf6b6e67585a82ab2dce268580530adb7b052a9b77bf9c48e894e"
S = "${WORKDIR}/python_qt_binding-release-release-lunar-python_qt_binding-0.3.3-2"

inherit catkin
