# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mechanisms for loading a ros node at runtime."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native dynamic-reconfigure feed-the-troll-msgs python-termcolor rocon-console rocon-python-utils rosgraph rospy rostest unique-id uuid-msgs"
SRC_URI = "https://github.com/stonier/feed_the_troll-release/archive/release/kinetic/feed_the_troll/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8bf4394640833b86d4f0390c037407a6"
SRC_URI[sha256sum] = "5676c27d3395d17fcb697f732b80679bb425f5905aaa1d392126be661af93fa1"
S = "${WORKDIR}/feed_the_troll-release-release-kinetic-feed_the_troll-0.1.1-0"

inherit catkin
