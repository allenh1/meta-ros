# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It pro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters pluginlib rosconsole roscpp roslib sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/kinetic/image_transport/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1588699ac6caddea416fac29267b37a"
SRC_URI[sha256sum] = "6f9e7abf09c1ac9f8b8ea7f6df2c49f88c7708a5feefe25089bda48a877fef22"
S = "${WORKDIR}/image_common-release-release-kinetic-image_transport-1.11.13-0"

inherit catkin
