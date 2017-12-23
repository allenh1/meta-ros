# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A plugin to image_transport for transparently sending images encoded with ImageZ"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge image-transport imagezero-ros message-runtime sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/lunar/imagezero_image_transport/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e19b94bb0f26a3aa31248a0464edbf3"
SRC_URI[sha256sum] = "97a6c6e703cbf0a22de2bd84dcab37eeecf8ec2ba661af09643f4ff682b2d816"
S = "${WORKDIR}/imagezero_transport-release-release-lunar-imagezero_image_transport-0.2.4-0"

inherit catkin
