# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node that simply forwards odometry information."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "angles catkin geometry-msgs message-filters nav-msgs rosconsole roscpp rospy tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/fake_localization/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5fc70a8530b82cce089f93b4d0c1d778"
SRC_URI[sha256sum] = "1bf2bac8fa630b1b49d1523643f2c15ab770c45e5365d614e48efd95e73eecd3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
