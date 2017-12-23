# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This  library contains wrappers for generating floating point values, integers, "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/ros-gbp/random_numbers-release/archive/release/kinetic/random_numbers/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c579971e20117fb56466f8a15fcfa37b"
SRC_URI[sha256sum] = "0e74947775fe6c8be2e455d1d471e99467d7d3252ea9d850cd531bc8c0c5fe62"
S = "${WORKDIR}/random_numbers-release-release-kinetic-random_numbers-0.3.1-0"

inherit catkin
