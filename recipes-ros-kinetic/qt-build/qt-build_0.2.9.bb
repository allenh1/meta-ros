# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Currently just maintains a cmake api for simplifying the building     of qt apps"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/yujinrobot-release/qt_ros-release/archive/release/kinetic/qt_build/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24bc9afec0501ceafc4ddeed4bc58be5"
SRC_URI[sha256sum] = "a745f0d08e095e0d3e16da5829a4ce161d3c2f4be18524474752d2ac4173cb08"
S = "${WORKDIR}/qt_ros-release-release-kinetic-qt_build-0.2.9-0"

inherit catkin
