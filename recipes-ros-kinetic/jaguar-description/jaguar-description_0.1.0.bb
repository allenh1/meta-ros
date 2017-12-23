# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A robot description package for Dr Robot's Jaguar 4x4"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp tf urdf xacro"
SRC_URI = "https://github.com/gstavrinos/jaguar-release/archive/release/kinetic/jaguar_description/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfba82faf9e55de00d5ac253d14694ac"
SRC_URI[sha256sum] = "e18b6815a1f4e2bfa9e27f96b7513f23c31a08394fae025f003eb340a51b6b66"
S = "${WORKDIR}/jaguar-release-release-kinetic-jaguar_description-0.1.0-0"

inherit catkin
