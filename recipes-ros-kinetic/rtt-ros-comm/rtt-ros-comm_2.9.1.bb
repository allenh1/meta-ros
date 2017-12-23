# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtt_ros_comm package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-rosgraph-msgs rtt-std-msgs rtt-std-srvs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_ros_comm/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a3e9c463a3cbb9846f388e408dec750"
SRC_URI[sha256sum] = "6f7487eeea5ab0cdf9e588f229af9ac50cba73c8ad442b2fd90d99fd53eff0d8"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_ros_comm-2.9.1-0"

inherit catkin
