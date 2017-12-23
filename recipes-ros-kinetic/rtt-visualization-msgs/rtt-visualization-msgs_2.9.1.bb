# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS visualization_msgs messages.      It allows you "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-geometry-msgs rtt-roscomm rtt-std-msgs visualization-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_visualization_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2caf15162c352222b6b51656dd8b0cdb"
SRC_URI[sha256sum] = "e24ecfe1c4aed4f9234bc44b1c21e5443be28537d57ba4ba00fbe0d629d0bca2"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_visualization_msgs-2.9.1-0"

inherit catkin
