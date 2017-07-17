# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_visualization_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=34b08f742b136bec0030241368f720fc"

DEPENDS = "catkin geometry_msgs message_generation message_runtime sensor_msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_visualization_msgs/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2346898f6f4fb3f865c7769b490b1045"
SRC_URI[sha256sum] = "1ee6ff2b77b8294ecbfaa68c8000269b06be05de7cfb5b828a358996d2dfdcf7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
