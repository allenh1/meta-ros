# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime pkgconfig"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "57924fd3f8d2185bc5b7097315a30aed"
SRC_URI[sha256sum] = "f2bfbca788cfc29e6d88815c9e9ba1f37f55f4a693a110e7c22e615190084e55"
S = "${WORKDIR}/ros-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
