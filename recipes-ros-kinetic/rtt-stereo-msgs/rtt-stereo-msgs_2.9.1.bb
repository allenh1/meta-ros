# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS stereo_msgs messages.      It allows you to use "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-geometry-msgs rtt-roscomm rtt-sensor-msgs rtt-std-msgs stereo-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_stereo_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "660034f46f5e597ece4f265493d9ca8b"
SRC_URI[sha256sum] = "2bab5e9478669f2df3529e0c6bb5c17b98731861e99ff4891e5f1bb1fc488a78"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_stereo_msgs-2.9.1-0"

inherit catkin
