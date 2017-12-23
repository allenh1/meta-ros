# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an OpenNI device and load all nodelets to       convert raw"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet openni-camera rgbd-launch roslaunch"
SRC_URI = "https://github.com/ros-gbp/openni_launch-release/archive/release/lunar/openni_launch/1.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "897b6a34a118e1d1200668c351b774d7"
SRC_URI[sha256sum] = "8f8b99f525c813f34ec2f50131ac64515fcb794b2a53caa4dd9c1e975cceda01"
S = "${WORKDIR}/openni_launch-release-release-lunar-openni_launch-1.9.8-0"

inherit catkin
