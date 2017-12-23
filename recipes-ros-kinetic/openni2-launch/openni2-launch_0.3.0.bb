# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc image-proc nodelet openni2-camera python-catkin-pkg-native rgbd-launch tf"
SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/kinetic/openni2_launch/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "167c63349481717d12d4a395dd11ac3f"
SRC_URI[sha256sum] = "64913f693c5b7ce5482533cf0792a10feb58c4e3505a52b7d8b2fdead9282b0d"
S = "${WORKDIR}/openni2_camera-release-release-kinetic-openni2_launch-0.3.0-0"

inherit catkin
