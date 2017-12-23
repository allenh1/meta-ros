# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rtt_roscomm provides the necessary template files and cmake macros for     autom"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg roscpp rtt-ros rtt-rosnode rtt-rospack"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_roscomm/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "666037a395c4d87fbe8dcca7551fe2c0"
SRC_URI[sha256sum] = "1f38ac50d24d8ac6a5ee9b7eeeecbdace2b80192adb1b82c63f5dd8f9b0a2084"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_roscomm-2.9.1-0"

inherit catkin
