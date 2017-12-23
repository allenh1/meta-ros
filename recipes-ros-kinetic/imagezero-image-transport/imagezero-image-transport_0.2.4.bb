# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A plugin to image_transport for transparently sending images encoded with ImageZ"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-transport imagezero-ros message-runtime sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/kinetic/imagezero_image_transport/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75fc07e0dced5cee0d74a659721cd34c"
SRC_URI[sha256sum] = "9ed895b2065c4d0a608fb421cdd510e5b6d75f657ce93f6f08858271ce69a66e"
S = "${WORKDIR}/imagezero_transport-release-release-kinetic-imagezero_image_transport-0.2.4-0"

inherit catkin
