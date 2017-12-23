# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bayesian_belief_networks package form https://github.com/eBay/bayesian-belie"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e8978a5103d23266fc6f8ec03dc9eb16"

DEPENDS = "catkin-native git message-generation message-runtime mk rospy std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/bayesian_belief_networks/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac187084c787e3060758e00e18818db1"
SRC_URI[sha256sum] = "d4d92fb07686a90adf7f5bd49cd8c5173b6976f1642a51911c85a95000031206"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-bayesian_belief_networks-2.1.6-0"

inherit catkin
