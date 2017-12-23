# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS std_msgs messages.      It allows you to use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg rtt-roscomm std-srvs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_std_srvs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "615cbd03307de600505d6a259dc4fb85"
SRC_URI[sha256sum] = "e03a346d0b2763bc9c21091e164b061382ab961ce0638b18f7922e9f93a56c86"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_std_srvs-2.9.1-0"

inherit catkin
