# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It pro"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-filters pluginlib rosconsole roscpp roslib sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/image_transport/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88fa488431b3b7dc50839ad092cb8124"
SRC_URI[sha256sum] = "4e8e501fc16ce319691fa5334da79c6a15df2275b18809deabd8379a3a152064"
S = "${WORKDIR}/image_common-release-release-lunar-image_transport-1.11.13-0"

inherit catkin
