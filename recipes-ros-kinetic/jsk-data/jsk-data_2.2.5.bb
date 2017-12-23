# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_data package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc dynamic-reconfigure image-transport jsk-topic-tools message-generation message-runtime nodelet openni-launch paramiko pr2-description pr2-machine python-click python-gdown-pip python-pyyaml rosbag rqt-bag rviz tf2-ros xacro"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_data/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb63ce0536e760fe5a03ff31aa92dd99"
SRC_URI[sha256sum] = "ca628d11d6291d313cd4cb4add37ef9592dff0b73a9a7aec4cdd16fe0a5db3c2"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_data-2.2.5-0"

inherit catkin
