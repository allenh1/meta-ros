# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS wrapper for slime"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=90cf8e14bb501c1f6d3eda81e45e438a"

DEPENDS = "catkin-native emacs"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/kinetic/slime_wrapper/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de0a3fc5db708c7c9137458ed826c001"
SRC_URI[sha256sum] = "c9718746efb2738082fb9e8a07bdfd0e763cd5bcf9ec22e34d5f51fff520588f"
S = "${WORKDIR}/ros_emacs_utils-release-release-kinetic-slime_wrapper-0.4.11-0"

inherit catkin
