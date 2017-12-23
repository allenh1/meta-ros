# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules message-filters roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/kinetic/imu_complementary_filter/1.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "386a7fc56aa5d2ee503f898251e8d81a"
SRC_URI[sha256sum] = "32b31179ae76825920ff0958585541d5ec4292a4d64a68c428d8927a393b3164"
S = "${WORKDIR}/imu_tools-release-release-kinetic-imu_complementary_filter-1.1.4-0"

inherit catkin
