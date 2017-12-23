# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtt_common_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-actionlib-msgs rtt-diagnostic-msgs rtt-geometry-msgs rtt-nav-msgs rtt-sensor-msgs rtt-shape-msgs rtt-stereo-msgs rtt-trajectory-msgs rtt-visualization-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_common_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "26c8969183ea8c2e0ed27f2aabd44942"
SRC_URI[sha256sum] = "357976070fb40fd4a22cb2f3464e05825ac10fc3dfcfcaf891eafda82e864366"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_common_msgs-2.9.1-0"

inherit catkin
