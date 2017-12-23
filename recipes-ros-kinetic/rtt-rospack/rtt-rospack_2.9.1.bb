# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rtt_rospack provides an RTT plugin to use rospack to find packages in your ROS_P"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslib rtt-ros"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rospack/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1390a518d4746d0c86b3db01de6479d2"
SRC_URI[sha256sum] = "dcb1cce59a0b22a2bd49d57750885cf1ddfb5a7896364b39f1ed80cc8c6bad4b"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rospack-2.9.1-0"

inherit catkin
