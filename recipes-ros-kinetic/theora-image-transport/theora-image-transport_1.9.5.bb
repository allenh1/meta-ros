# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for     transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-transport libogg libtheora message-generation message-runtime pluginlib rosbag std-msgs"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/kinetic/theora_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00ea04fb27e5805e1414674ea079faf8"
SRC_URI[sha256sum] = "88c28d0f55dd9ca60a3dc313b3eccf4ba387728ccd50890ff302119cbb59dac7"
S = "${WORKDIR}/image_transport_plugins-release-release-kinetic-theora_image_transport-1.9.5-0"

inherit catkin
