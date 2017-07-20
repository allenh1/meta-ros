# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_ez_publisher package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry-msgs python-catkin-pkg rospy rostest rqt-gui rqt-gui-py rqt-py-common tf tf2-msgs"
SRC_URI = "https://github.com/OTL/rqt_ez_publisher-release/archive/release/lunar/rqt_ez_publisher/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbcb2aa93f4a64adbd83e7b74d7fd5d5"
SRC_URI[sha256sum] = "5d80b3a575e4b1827b39c2afc849afb87ce9cf5f6b9dc4cf8d72ddbefaa653f4"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
