# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rosmsg rospy rqt-gui rqt-gui-py rqt-msg"
SRC_URI = "https://github.com/ros-gbp/rqt_srv-release/archive/release/lunar/rqt_srv/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13e4fb71fc7fc79f16df38080fb2965c"
SRC_URI[sha256sum] = "f2303a52fffc0e96fe2e955b3fd8126b7a09f117cc2d0cbe974ce4e65901134c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
