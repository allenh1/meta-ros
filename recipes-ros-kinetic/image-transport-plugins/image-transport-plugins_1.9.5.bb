# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native compressed-depth-image-transport compressed-image-transport theora-image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/kinetic/image_transport_plugins/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a4da72e5fdbeb7cc19696000694668b"
SRC_URI[sha256sum] = "bb8de92c84362bcdaf7974b04618a958aecdb9589d8168f79048a87b8a7725bc"
S = "${WORKDIR}/image_transport_plugins-release-release-kinetic-image_transport_plugins-1.9.5-0"

inherit catkin
