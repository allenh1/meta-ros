# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-pydot python-qt-binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_dotgraph/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b3a1ded8dfe314ef46d1e8a305d7027"
SRC_URI[sha256sum] = "296249296e92e2f2e8de3369bab782b9ec2efe2d48514145dc83a914f3d08f6b"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_dotgraph-0.3.8-0"

inherit catkin
