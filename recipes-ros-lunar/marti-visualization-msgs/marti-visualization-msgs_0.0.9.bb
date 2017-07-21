# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_visualization_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry-msgs message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_visualization_msgs/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2346898f6f4fb3f865c7769b490b1045"
SRC_URI[sha256sum] = "1ee6ff2b77b8294ecbfaa68c8000269b06be05de7cfb5b828a358996d2dfdcf7"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_visualization_msgs-0.0.9-0"

inherit catkin
