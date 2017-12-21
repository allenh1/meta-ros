# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic diagnostic_aggregator tests are  in the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/test_diagnostic_aggregator/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "771e58d40f56daee307bd15cb8d45f34"
SRC_URI[sha256sum] = "a1d299e5a6c3176ca85df39bcab3be06a73f5be6167db86ae70773e0a7b9e6f9"
S = "${WORKDIR}/diagnostics-release-release-lunar-test_diagnostic_aggregator-1.9.2-0"

inherit catkin
