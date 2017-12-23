# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for     transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge dynamic-reconfigure image-transport libogg libtheora message-generation message-runtime pluginlib rosbag std-msgs"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/theora_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b58936244aaee6c35c7a56286193b25"
SRC_URI[sha256sum] = "5feaaca7927ec669760e9196f45bab865633a3a08f0a6884a7c6c59f90291018"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-theora_image_transport-1.9.5-0"

inherit catkin
