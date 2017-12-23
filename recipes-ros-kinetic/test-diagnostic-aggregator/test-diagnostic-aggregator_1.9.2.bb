# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic diagnostic_aggregator tests are  in the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/test_diagnostic_aggregator/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78678eef917db20535f44bd9f9379a0a"
SRC_URI[sha256sum] = "161ee85daeff672a1ecfbd767b4c2dbd2009934c18eb15cbee324be60812a2e4"
S = "${WORKDIR}/diagnostics-release-release-kinetic-test_diagnostic_aggregator-1.9.2-0"

inherit catkin
