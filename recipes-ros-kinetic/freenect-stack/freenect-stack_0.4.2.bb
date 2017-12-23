# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A libfreenect-based ROS driver for the Microsoft Kinect"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native freenect-camera freenect-launch"
SRC_URI = "https://github.com/ros-drivers-gbp/freenect_stack-release/archive/release/kinetic/freenect_stack/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a00843dfd1a21ab0c0297564d1884d5"
SRC_URI[sha256sum] = "1c077e368cc38a4865ab784696e9259e0b26587743b4a6fea95ba988566d71ea"
S = "${WORKDIR}/freenect_stack-release-release-kinetic-freenect_stack-0.4.2-0"

inherit catkin
