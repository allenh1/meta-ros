# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui provides the infrastructure for an integrated graphical user interface ba"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt5-bindings python-rospkg python-qt-binding qt5-qmake tango-icon-theme"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_gui/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "904fd3a8495b65b64ad749f8bbf0c386"
SRC_URI[sha256sum] = "638ee4683cb0800b062719be7abf95b00681b975c540d905b6fd5b5b93f905b9"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_gui-0.3.8-0"

inherit catkin
