# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains standard capability interfaces, which describe common robo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/std_capabilities-release/archive/release/kinetic/std_capabilities/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e95d0f5d840927f65a3e250cc8810720"
SRC_URI[sha256sum] = "d8277854e369322931b631d56800492becc7c1e56ce707f2e1124a590cfa7349"
S = "${WORKDIR}/std_capabilities-release-release-kinetic-std_capabilities-0.1.0-0"

inherit catkin
