# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple script that aggregates all of the topics that a "pr2_dashboard" app mig"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pr2-msgs rospy std-msgs"
SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/kinetic/pr2_dashboard_aggregator/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81eb026a53f769b276052cc64785901b"
SRC_URI[sha256sum] = "d11d38f779680000a0625c765e5db482599c6bdbabb2baf167dca1d661e2ea34"
S = "${WORKDIR}/pr2_common-release-release-kinetic-pr2_dashboard_aggregator-1.12.0-0"

inherit catkin
